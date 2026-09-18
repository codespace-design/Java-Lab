import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// ------------------------------
// Thread 1: Countdown
// ------------------------------
class CountdownThread extends Thread {

    private TextArea output;

    public CountdownThread(TextArea output) {
        this.output = output;
    }

    @Override
    public void run() {

        for (int i = 5; i >= 1; i--) {

            int number = i;

            Platform.runLater(() -> output.appendText("Countdown: " + number + "\n"));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

                Platform.runLater(() -> output.appendText("Countdown interrupted!\n"));

                break;
            }
        }

        Platform.runLater(() -> output.appendText("Countdown finished.\n\n"));
    }
}

// ------------------------------
// Runnable: Even/Odd numbers
// ------------------------------
class NumberPrinter implements Runnable {

    private boolean printEven;
    private TextArea output;

    public NumberPrinter(boolean printEven, TextArea output) {
        this.printEven = printEven;
        this.output = output;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            if (printEven && i % 2 == 0) {

                int number = i;

                Platform.runLater(() -> output.appendText("Even: " + number + "\n"));
            }

            if (!printEven && i % 2 != 0) {

                int number = i;

                Platform.runLater(() -> output.appendText("Odd: " + number + "\n"));
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

                Platform.runLater(() -> output.appendText("Number thread interrupted!\n"));

                break;
            }
        }
    }
}

// ------------------------------
// JavaFX Application
// ------------------------------
public class ThreadDemo extends Application {

    private TextArea output;
    private Thread countdownThread;

    @Override
    public void start(Stage stage) {

        Label title = new Label("JavaFX Multithreading Demo");

        output = new TextArea();
        output.setEditable(false);
        output.setPrefHeight(300);

        Button countdownButton = new Button("Start Countdown");

        Button evenOddButton = new Button("Start Even + Odd");

        Button interruptButton = new Button("Interrupt Countdown");

        Button clearButton = new Button("Clear");

        // ------------------------------
        // Start Countdown Thread
        // ------------------------------
        countdownButton.setOnAction(event -> {

            countdownThread = new CountdownThread(output);

            countdownThread.start();
        });

        // ------------------------------
        // Start two Runnable threads
        // ------------------------------
        evenOddButton.setOnAction(event -> {

            Runnable evenTask = new NumberPrinter(true, output);

            Runnable oddTask = new NumberPrinter(false, output);

            Thread evenThread = new Thread(evenTask);

            Thread oddThread = new Thread(oddTask);

            evenThread.start();
            oddThread.start();
        });

        // ------------------------------
        // Interrupt countdown
        // ------------------------------
        interruptButton.setOnAction(event -> {

            if (countdownThread != null &&
                    countdownThread.isAlive()) {

                countdownThread.interrupt();
            }
        });

        // ------------------------------
        // Clear output
        // ------------------------------
        clearButton.setOnAction(event -> {

            output.clear();
        });

        VBox layout = new VBox(
                10,
                title,
                countdownButton,
                evenOddButton,
                interruptButton,
                clearButton,
                output);

        layout.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(layout, 500, 450);

        stage.setTitle("Multithreading Demo");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
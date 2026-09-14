# Java Exception Handling Exercises

This project contains the 30 exercises from Levels 1-6. Each exercise is an independent Java program.

## Structure

- `src/level1`: Built-in exceptions
- `src/level2`: File handling exceptions
- `src/level3`: `throw` and `throws`
- `src/level4`: User-defined exceptions
- `src/level5`: Mixed problems
- `src/level6`: Comprehensive exercises

## Compile all programs

From the project root in PowerShell:

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName)
```

The programs use Java packages matching their level. Run one after compiling, for example:

```powershell
java -cp out level1.DivisionByZero
java -cp out level4.InvalidAgeExceptionDemo
```

`StudentRecordFile` expects comma-separated records such as `Alice,85`, one record per line.

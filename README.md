# qacobra
Web UI Test automation with Selenide and TestNG

## Output
The output is saved in 2 folders:

1. a folder called "screenshots" in the same directory as the script.
2. a folder called "test_reports" in the same directory as the script. It contains a csv file with the failed tests.
3. a file called "report.html" in the same directory as the script. It contains the test results of all tests.

## Troubleshooting
If you encounter any issues, please check the following:
- Ensure that the config.json file is in the same directory as the script.
- Ensure that the config.json file is correctly formatted.
- Ensure that the requirements have been installed correctly.
- Run manually in an admin PowerShell terminal the commands from run_tests.ps1 file.
  Inspect the errors. Sometimes the admins rights and the command 'Set-ExecutionPolicy RemoteSigned' is needed for the venv
  to work correctly.
- Ensure that the website is accessible from your location.
- Ensure that the website is not down.
- Ensure that the **website has not changed its structure or design**. If it has, probably the selectors for
  the input fields and buttons should be changed in the script.

# Unicode to HTML text converter

The `UnicodeToHtmlTextConverter` class is designed to reformat a plain text file for display in a browser.

In the `main` branch, the class `UnicodeToHtmlTextConverter` has a direct dependency on the Java `FileReader` class.
As a consequence, all our tests depend on the file system.

In the `fake` branch we introduce an abstraction that makes it possible to use a fake object in our tests. 

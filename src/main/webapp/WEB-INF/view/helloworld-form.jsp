<!DOCTYPE html>
<html>
<head>
    <title>Hello World - Input Form</title>
</head>

<body>
<form action="processForm" method="get">
    <label>V1 process form</label>
    <input type="text" name="studentName" placeholder="What's your name?"/>
    <input type="submit"/>
</form>
<hr/>
<form action="processFormAndUpperCase" method="get">
    <label>Process form and change name to uppercase</label>
    <input type="text" name="studentName" placeholder="What's your name?"/>
    <input type="submit"/>
</form>
<hr/>
<form action="convertToUpperCaseWithRequestParam" method="get">
    <label>Convert to uppercase with @RequestParam</label>
    <input type="text" name="studentName" placeholder="What's your name?"/>
    <input type="submit"/>
</form>
</body>

</html>
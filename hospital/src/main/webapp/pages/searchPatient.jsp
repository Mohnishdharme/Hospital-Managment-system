<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Search Patient</title>
</head>
<body>
    <h2>Search for Patient</h2>
    <form action="searchPatient" method="post">
        <label for="id">Enter Patient ID:</label>
        <input type="text" id="id" name="id" required />
        <input type="submit" value="Search" />
    </form>
</body>
</html>

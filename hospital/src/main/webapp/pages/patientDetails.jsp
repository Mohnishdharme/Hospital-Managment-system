<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Patient Details</title>
</head>
<body>
    <h2>Patient Details</h2>
    
    <c:if test="${not empty viewPatient}">
        <p>ID: ${viewPatient.id}</p>
        <p>Name: ${viewPatient.name}</p>
        <p>Age: ${viewPatient.age}</p>
        <p>Gender: ${viewPatient.gender}</p>
        <p>Mobile: ${viewPatient.mobile}</p>
        <p>Condition: ${viewPatient.condition}</p>
    </c:if>
    
    <c:if test="${empty viewPatient}">
        <p>No patient details available.</p>
    </c:if>
</body>
</html>

<!DOCTYPE html>
<html>
<head>
    <title>Lata Mangeshkar Hospital</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 15px;
            display: flex;
            justify-content: space-between;
        }

        nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
        }

        nav ul li {
            display: inline-block;
            margin-right: 20px;
        }

        nav ul li a {
            text-decoration: none;
            color: #fff;
        }

        main {
            padding: 20px;
        }

        .patient-info {
            background-color: #f5f5f5;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <header>
        <h1>Lata Mangeshkar Hospital</h1>
        <nav>
            <ul>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Search Patient</a></li>
                <li><a href="#">Login</a></li>
                
            </ul>
        </nav>
    </header>

    <main>
        <div class="patient-info">
            <h2>Patient Information</h2>
            <c:if test="${not empty viewPatient}">

            <p><strong>Name:</strong>${viewPatient.name}</p>
            <p><strong>Age:</strong>${viewPatient.age}</p>
            <p><strong>Condition:</strong> ${viewPatient.condition}</p>
           
            
        </div>
    </main>
    <hr>
    <h1>Staff List</h1>
 <ul>
        <c:forEach var="staff" items="${staffList}">
            <li>
                <strong>Name:</strong> ${staff.name}<br>
                <strong>Position:</strong> ${staff.position}<br>
                <strong>Specialization:</strong> ${staff.specialization}<br>
                <strong>Age:</strong> ${staff.age}<br>
                <strong>Gender:</strong> ${staff.gender}<br>
                <strong>Mobile:</strong> ${staff.mobile}<br>
            </li>
            <hr>
        </c:forEach>
    </ul>
    
    <form action="administrator" method="get">
    <button  type="submit" >Adminstrator login</button>
    </form>
    

    
</body>
</html>
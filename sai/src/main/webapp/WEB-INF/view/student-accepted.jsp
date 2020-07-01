<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head> Student Acceptance Form </head>
 <body>
   <h1> Welcome to Harvard, ${student.firstName} ${student.lastName} </h1>

    <h1> Student is a citizen of ${student.country} country </h1>

    <h1> Student likes to code in ${student.favouriteLanguage} </h1>

    Student like following operating systems :
    <ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li> ${temp} </li>
     </c:forEach>
     </ul>
 </body>
</html>
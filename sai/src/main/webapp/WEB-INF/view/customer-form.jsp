<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
 <head>
    <h1> Customer Form </h1>
    <style>
      .error {
        color:red;
      }
    </style>
 </head>
 <body>
   <form:form action="processForm" modelAttribute="customer">
    First Name <form:input path="firstName"/>
    <br>

    Last Name <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br>

    Postal Code<form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br>

    Free Passes <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br>

    Courses <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br>

    <input type="submit" value="submit"/>
   </form:form>
  </body>
 </html>

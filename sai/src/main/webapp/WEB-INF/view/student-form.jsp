<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
 <head> Student Form </head>
 <body>
    <form:form action="processForm" modelAttribute="student">

    First Name <form:input path="firstName"/>

    <br><br>

    Last  Name <form:input path="lastName" />

    <br><br>
    <form:select path="country">
     <form:options items="${countries}"/>
    </form:select>
    <br><br>

    Java <form:radiobutton path="favouriteLanguage" value="Java"/>
    C# <form:radiobutton path="favouriteLanguage" value="C#"/>
    Python <form:radiobutton path="favouriteLanguage" value="Python"/>
    C++ <form:radiobutton path="favouriteLanguage" value="C++" name="C++"/>

    <br><br>

    Windows <form:checkbox path="operatingSystems" value="Windows"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    Linux <form:checkbox path="operatingSystems" value="Linux"/>

    <input type="submit" value="Submit"/>
    <br><br>

    </form:form>
 </body>
</html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Struts2</title>
</head>
<body>
    <h1>Struts2</h1>
    <s:form action="Link" id="actionMappingId">
        <s:label for = "name">Please enter your name</s:label><br/>
        <s:textfield name="name" label="name"></s:textfield>
        <s:submit id="submitId" method="execute" value="Submit" />
        <s:submit id="showId" method="showTest" value="Show" />
    </s:form>
</body>
</html>
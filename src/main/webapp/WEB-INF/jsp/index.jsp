<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<spring:url value="css/style.css" />">
<script type="text/javascript" src="webjars/jquery/2.2.2/jquery.min.js"></script>
<script type="text/javascript" src="<spring:url value="js/rpnCalculator.js"/> " ></script>
    <meta charset="UTF-8">
    <title>Digester</title>
</head>
<body>
<div id="header">MD5</div>
<div>
<form method="POST" action="/md5">
      <table>
        <tr>
            <td>Source String</td>
            <td><input name="source" type="text" value = "${source}"/></td>
        </tr>
        <tr>
            <td>Result:</td>
            <td>${result}</td>
        </tr>
        <tr>
            <td colspan="2">
              <input type="submit" value="Generate MD5" />
            </td>
        </tr>
      </table>
  </form>
</div>


<%@page import="com.liferay.servicebuilder.model.Type" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ include file="/shoe/init.jsp" %>

<portlet:actionURL name="TypeUpdate" var="TypeUpdateURL" />

<h1>Type details:</h1>

<aui:form name="fm" action="${TypeUpdateURL}">
	<aui:input name="typeId" type="hidden" value="${type.getTypeId()}"></aui:input>
	<aui:input name="name" value="${type.getName()}">
		<aui:validator name="required"></aui:validator>
	</aui:input>
	
	<aui:button-row>
		<aui:button type="submit" value="Update Type"/>
	</aui:button-row>
</aui:form>
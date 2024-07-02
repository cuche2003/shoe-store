<%@page import="com.liferay.servicebuilder.model.Shoe" %>

<%@page import="com.liferay.servicebuilder.service.BrandServiceUtil" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="/shoe/init.jsp" %>

<portlet:actionURL name="ShoeCreate" var="ShoeCreateURL" />

<h1>Shoe details:</h1>

<aui:form name="fm" action="${ShoeCreateURL}">
	<aui:model-context bean="${shoe}" model="<%= Shoe.class %>" />
	<aui:input name="shoeModel" label="Model">
		<aui:validator name="required"/>
	</aui:input>
	<aui:select name="gender" lable="Gender">
		<aui:validator name="required"/>
 		<aui:option value="Men">Men</aui:option>
  		<aui:option value="Women">Women</aui:option>
	</aui:select>
	<aui:input name="size" label="Size">
		<aui:validator name="required"/>
 		<aui:validator name="number"/>
	</aui:input>
	<aui:select name="brandId" inlineField="${true}" label="Brand">
		<aui:validator name="required"/>
		<c:forEach items="${ brands }" var="brand">
			<aui:option value="${brand.getBrandId()}">${brand.getName()}</aui:option>
		</c:forEach>
	</aui:select>
	<aui:select name="typeId" inlineField="${true}" label="Type">
		<aui:validator name="required"/>
		<c:forEach items="${ types }" var="type">
			<aui:option value="${type.getTypeId()}">${type.getName()}</aui:option>
		</c:forEach>
	</aui:select>
	<aui:input name="price" label="Price">
		<aui:validator name="required"/>
		<aui:validator name="number"/>
	</aui:input>
	
	<aui:button-row>
		<aui:button type="submit" value="Create Shoe"/>
	</aui:button-row>
</aui:form>
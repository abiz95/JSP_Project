<%-- 
    Document   : Checkout
    Created on : Feb 25, 2013, 11:43:40 AM
    Author     : nazaraf
--%>

<%@ page session="true" import="java.util.*, models.Book" %>
<html>
<head>
<title>Books Store Checkout</title>
</head>
<body bgcolor="Grey">
 
  BOOKS  Checkout
 </font>
 <hr><p>
 <center>
 <table border="0" cellpadding="0" width="100%" bgcolor="green">
 <tr>
 <td><b>Book</b></td>
 <td><b>Author</b></td>
 <td><b>PRICE</b></td>
 <td><b>QUANTITY</b></td>
 <td></td>
 </tr>
 <%
  ArrayList list = (ArrayList) session.getAttribute("shoppingcart");
  String amount = (String) request.getAttribute("amount");
  for (int i=0; i < list.size();i++) {
   Book order = (Book) list.get(i);
 %>
 <tr>
 <td><b><%= order.getName() %></b></td>
 <td><b><%= order.getAuthor() %></b></td>
 <td><b><%= order.getPrice() %></b></td>
 <td><b><%= order.getQuantity() %></b></td>
 </tr>
 <%
  }
  session.invalidate();
 %>
 <tr>
 <td>  -   </td>
 <td>  -  </td>
 <td><b>TOTAL</b></td>
 <td><b>£<%= amount %></b></td>
 <td>     </td>
 </tr>
 </table>
 <p>
 <a href="index.jsp">Shop more!</a>
 </center>
</body>
</html>
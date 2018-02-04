<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Index</title>
	<s:head />
</head>
<body>
	<div class="row">
	  <div class="col-sm-9">
	    <div class="card">
	      <img class="card-img-top" src="<s:url value='/images/books-1281581_1920.jpg'/>" alt="Card image cap">
	      <div class="card-block">
	        <h3 class="card-title">Bienvenue sur le site de votre biblioth�que</h3>
	        <p class="card-text">Retrouvez tous vos livres et revues pr�f�r�s sur ce site! 
	        Consultez vos pr�ts en cours ainsi que les disponibilit�s de vos livres pr�f�r�s. Vous pouvez �galement prolonger
	        vos pr�ts dans la limite d'un renouvellement par pr�t.</p>
	        <a href="<s:url action="search" namespace="liborrow"/>" class="btn btn-primary">Rechercher des ouvrages</a>
	      </div>
	      <ul class="list-group list-group-flush">
		    <li class="list-group-item">
		    	<h3 class="card-title">Livres r�cemment ajout�s</h3>
		    	<p class="card-text">
		    		<table class="table table-striped">
					  <thead class="thead-inverse">
					    <tr>
					      <th>#</th>
					      <th>Titre</th>
					      <th>Editeur</th>
					      <th>Langue</th>
					      <th>Auteur</th>
					      <th>Restant</th>
					    </tr>
					  </thead>
					  <tbody>
					    <s:iterator value="searchResponse.books" status="status">
							<tr>
						      <th scope="row"><s:property value="%{#status.index+1}"/></th>
						      <s:url action="book" var="bookUrl" namespace="/liborrow" >
								    <s:param name="idBook"><s:property value="id"/></s:param>
							  </s:url>
						      <td><a href="${bookUrl}"><s:property value="title"/></a></td>
						      <td><s:property value="editor"/></td>
						      <td><s:property value="language"/></td>
						      <td>
						      	<ul>
						      		<s:iterator value="authors"><li><s:property value="firstname"/> <s:property value="name"/></li></s:iterator>
						      	</ul>
						      </td>
						      <td><s:property value="remainingCount"/></td>
						    </tr>
						</s:iterator>
					  </tbody>
					</table>
		    	</p>
		    </li>
		    <li class="list-group-item">
		    	<h3 class="card-title">Revus r�cemment ajout�es</h3>
		    	<p class="card-text">
		    		<table class="table table-striped">
					  <thead class="thead-inverse">
					    <tr>
					      <th>#</th>
					      <th>Nom</th>
					      <th>Num�ro</th>
					      <th>Date de sortie</th>
					      <th>Restant</th>
					    </tr>
					  </thead>
					  <tbody>
					    <s:iterator value="searchResponse.magazines" status="status">
							<tr>
						      <th scope="row"><s:property value="%{#status.index+1}"/></th>
						      <s:url action="magazine" var="magazineUrl" namespace="/liborrow" >
								    <s:param name="idMagazine"><s:property value="id"/></s:param>
							  </s:url>
						      <td><a href="${magazineUrl}"><s:property value="name"/></a></td>
						      <td><s:property value="editionNumber"/></td>
						      <td><s:property value="publishDate.toGregorianCalendar().getTime()"/></td>
						      <td><s:property value="remainingCount"/></td>
						    </tr>
						</s:iterator>
					  </tbody>
					</table>
		    	</p>
		    </li>
		    <li class="list-group-item">
		    	<h3 class="card-title">Auteurs r�cemment ajout�s</h3>
		    	<p class="card-text">
		    		<table class="table table-striped">
					  <thead class="thead-inverse">
					    <tr>
					      <th>#</th>
					      <th>Nom</th>
					      <th>Pr�nom</th>
					      <th>Nationalit�s</th>
					      <th>Livres</th>
					    </tr>
					  </thead>
					  <tbody>
					    <s:iterator value="searchResponse.authors" status="status">
							<tr>
						      <th scope="row"><s:property value="%{#status.index+1}"/></th>
						      <td><s:property value="name"/></td>
						      <td><s:property value="firstname"/></td>
						      <td>
						      	<ul>
						      		<s:iterator value="citizenships"><li><s:property value="countryname"/></li></s:iterator>
						      	</ul>
						      </td>
						      <td>
						      	<ul>
						      		<s:iterator value="books"><li><s:property value="title"/> chez <s:property value="editor"/></li></s:iterator>
						      	</ul>
						      </td>
						    </tr>
						</s:iterator>
					  </tbody>
					</table>
		    	</p>
		    </li>
		  </ul>
	    </div>
	  </div>
	  <div class="col-sm-3">
	    <div class="card">
	        <h3 class="card-title">Mes pr�ts</h3>
	        <ul class="list-group list-group-flush">
			    <li class="list-group-item">
			    	<h5 class="card-title">Nombre de pr�t en cours</h5>
	    			<p><s:property value="nbBorrows"/></p>
			    </li>
			    <li class="list-group-item <s:if test="nbLate>0">bg-danger</s:if>">
			    	<h5 class="card-title">Nombre de pr�t en retard</h5>
			    	<div class="row">
			    		<div class="nbCircle">
			    			<p><s:property value="nbLate"/></p>
			    		</div>
			    	</div>
			    </li>
			    <li class="list-group-item">
			    	<a href="<s:url action="currentBorrows" namespace="/liborrow"/>" class="btn btn-primary">Mes pr�ts</a>
			    </li>
			</ul>
	    </div>
	  </div>
	</div>
</body>
</html>
	
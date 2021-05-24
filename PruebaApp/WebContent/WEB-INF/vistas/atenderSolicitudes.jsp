<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<jsp:include page="../templates/header.jsp"></jsp:include>
<main>
	<div class="column is-centered">
		<div class="column is-6">
			<form method="POST" action="IngresarController.do">
				<div class="card">
					<div class="card-header has-backgraound-primary">
						<span class="card-header-title">Ingresar Solicitudes</span>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label" for="nombre-txt">nombre </label>
							<div class="control">
								<input type="text" class="input" id="nombre-txt" name="nombre-txt">
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</main>

</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="row">
    <h2 align="center">Regisztráció</h2>
    <div class="col s12 l2"></div>
    <form:form class="col s12 l8" action="/library/signup" modelAttribute="user" method="post">
        <div class="input-field col s12">
            <form:label for="name" path="name">Név:</form:label>
            <form:input id="name" path="name" type="text"  />
        </div>
        <div class="input-field col s12">
            <form:label for="passwd" path="passwd">Jelszó:</form:label>
            <form:input id="passwd" path="passwd" type="password"  />
        </div>
        <div class="input-field col s12">
            <form:label for="email" path="email">E-mail:</form:label>
            <form:input id="email" path="email" type="email"  />
        </div>
        <p>
            <input class="with-gap" name="substype" value="user_normal" type="radio" id="normal" />
            <label for="normal">Normál</label>
        </p>
        <p >
            <input class="with-gap" name="substype" value="user_premium" type="radio" id="premium" />
            <label for="premium">Prémium</label>
        </p>
        <div class="input-field col s12 right-align">
            <!--<button class="btn" type="submit" id="registerBtn">Regisztrálok<i class="material-icons right">send</i></button>
            -->
            <input type="submit" value="kurvaanyád">
        </div>
    </form:form>
    <div class="col s12 l2"></div>
</div>

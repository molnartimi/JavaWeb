<div class="row">
    <h2 align="center">Regisztráció</h2>
    <form class="col s12 text-center" method="post" action="send-registration">
        <div class="input-field col s12">
            <label for="name">Név:</label>
            <input type="text" id="name" name="user_name">
        </div>
        <div class="input-field col s12">
            <label for="passwd">Jelszó:</label>
            <input type="password" id="passwd" name="user_passwd">
        </div>
        <div class="input-field col s12">
            <label for="passwdagain">Jelszó újra:</label>
            <input type="password" id="passwdagain" name >
        </div>
        <div class="input-field col s12">
            <label for="email">E-mail:</label>
            <input type="text" id="email" name="user_email">
        </div>
        <p>
            <input class="with-gap" name="substype" type="radio" id="normal" />
            <label for="normal">Normál</label>
        </p>
        <p >
            <input class="with-gap" name="substype" type="radio" id="premium" />
            <label for="premium">Prémium</label>
        </p>
        <div class="input-field col s12">
            <button class="btn" type="submit" id="registerBtn">Regisztrálok
                <i class="material-icons right">send</i>
            </button>
        </div>
    </form>
</div>

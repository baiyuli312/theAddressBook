window.onload = function() {
    var psw1 = document.getElementById("psw1");
    var psw2 = document.getElementById("psw2");
    var psw3 = document.getElementById("psw3");

    var i1 = document.getElementsByClassName("icon-icon-test")
    showAndHidden(psw1, i1[0]);




}

function showAndHidden(content, btn) {

    btn.onclick = function() {
        if (btn.classList.contains('icon-icon-test')) {
            btn.classList.remove('icon-icon-test');
            btn.classList.add('icon-icon-test1');

        } else {
            btn.classList.remove('icon-icon-test1');
            btn.classList.add('icon-icon-test');
        }
        if (content.type == "password") {
            content.type = "text";
        } else {
            content.type = "password";
        }
    }
}
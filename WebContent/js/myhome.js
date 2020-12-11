window.onload = function() {
    var groups = document.getElementsByClassName("group");
    var groupnames = document.getElementsByClassName("groupname");


    groupnames[0].onclick = function() {
        const num = document.querySelectorAll(".family li").length;
        if (window.getComputedStyle(groups[0]).height == "35px") {
            groups[0].style.height = (num * 25 + 35) + "px";
        } else {
            groups[0].style.height = "35px";
        }
    }
    groupnames[1].onclick = function() {
        const num = document.querySelectorAll(".classmate li").length;
        if (window.getComputedStyle(groups[1]).height == "35px") {
            groups[1].style.height = (num * 25 + 35) + "px";
        } else {
            groups[1].style.height = "35px";
        }
    }
    groupnames[2].onclick = function() {
        const num = document.querySelectorAll(".friend li").length;
        if (window.getComputedStyle(groups[2]).height == "35px") {
            groups[2].style.height = (num * 25 + 35) + "px";
        } else {
            groups[2].style.height = "35px";
        }
    }



    var name = document.getElementsByTagName('li');

}
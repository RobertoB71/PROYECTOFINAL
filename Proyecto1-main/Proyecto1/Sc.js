/*Barras animadas a pico y a pala*/
document.querySelector(".bars__menu").addEventListener("click",animateBars);
var line1__bars = document.querySelector(".line1__bars-menu");
var line2__bars = document.querySelector(".line2__bars-menu");
var line3__bars = document.querySelector(".line3__bars-menu");

function animateBars(){
    line1__bars.classList.toggle("activeline1__bars-menu");
    line2__bars.classList.toggle("activeline2__bars-menu");
    line3__bars.classList.toggle("activeline3__bars-menu");
}
/*Barras animadas a pico y a pala*/
/*NavBar Oculto*/
document.getElementById("bMenu").addEventListener("click",mostrar_menu);
document.getElementById("nav")
let cadenaB ="true"


function mostrar_menu(){
    
    if(cadenaB=="true"){
        nav.style.top="85px";
        cadenaB="false";
    }
    else{
        nav.style.top="-999px";
        cadenaB="true";
    }
    
    
}

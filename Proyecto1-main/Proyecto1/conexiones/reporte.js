let baseUrl="http://localhost:8080";
let info = [];
 
function ObtenerInformacion(){
    fetch(baseUrl+'/reporte/all').then(res=>{
        res.json().then(json=>{
            info = json;
            ImprimirInfo();
        });
    });
}

function ImprimirInfo(){
    let contenedor = document.getElementById("infopag");

    info.forEach(Informacion=>{
        contenedor.innerHTML +=MapearInfo(Informacion);
    });
}

function MapearInfo(Informacion){
    return `<center><p><br>${Informacion.info } <br></p></center> `;;
}

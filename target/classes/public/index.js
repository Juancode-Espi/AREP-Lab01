

var index = (function(){
    return {
        conect : function(tipo,numero){
            //var invocation = new XMLHttpRequest();
            var url = 'http://localhost:4567/Converter/'+ tipo + '/' + numero;
            fetch(url)
                  .then(response => response.json())
                  .then(json => console.log(json))


        }
    }


})();
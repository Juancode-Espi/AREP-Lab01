

var index = (function(){
    return {
        conect : function(tipo,numero){
            //var invocation = new XMLHttpRequest();
            var url = 'https://powerful-garden-62570.herokuapp.com/Converter/'+ tipo + '/' + numero;
            fetch(url)
                  .then(response => response.json())
                  .then(json => console.log(json))


        }
    }


})();
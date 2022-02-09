

const index = (function(){
    return {

        convert(numero){
          let tipo = document.getElementById("unity").value;
          this.getMethod(tipo,numero);
        },

        getMethod : function(tipo,numero){
            //'http://localhost:4567/Converter'+ tipo + '/' + numero;
            var urlheroku = 'https://powerful-garden-62570.herokuapp.com/Converter/'+ tipo + '/' + numero;
            var url = 'http://localhost:4567/Converter/'+ tipo + '/' + numero;
            fetch(url)
                  .then(response => response.json())
                  .then(data => $('#answer').html(data.answer))


        }
    }


})();
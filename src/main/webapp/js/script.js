

$('.reg-btn').click(function() {

    var correct = true;

    const DOMstrings = {
        inputAmount : '#amount',
        inputQuantity : '#quantity',
        inputPercentage : '#percentage',
        inputFee : '#fixedFee'
    };

    if (correct){
        document.getElementById("myRegister").submit();
    }
});


/*for (var key in DOMstrings) {
       document.querySelector(DOMstrings[key]).classList.remove("error");
       if(DOMstrings.hasOwnProperty(key)){
           if (document.querySelector(DOMstrings[key]).value === '' || document.querySelector(DOMstrings[key]).value === null || document.querySelector(DOMstrings[key]).value.match(/[a-z]/i) || document.querySelector(DOMstrings[key]).value.match( /[\s-!$%^&*()_+|~=`{}\[\]:";'<>?\/]/)) {
               correct = false;
               console.log("error");
               document.querySelector(DOMstrings[key]).classList.add("error");
               document.querySelector('#err-js').innerHTML="Error";
               $('#err-js').addClass("animated shake");
               setTimeout(function () {
                   $('#err-js').removeClass("animated shake");
               }, 3000)
           }


       }
   }*/
var dataFutureAtCurrentRate;
var dataOne = $.getJSON("FutureAtCurrentRate.json", function(data){
    dataFutureAtCurrentRate = dataOne.responseJSON;
});

var dataFutureLastFiveDecade;
var dataTwo = jQuery.get("FutureAtRateLastFiveDecades.json", function(response) {
    dataFutureLastFiveDecade = dataTwo.responseJSON;
},"json");

var dataFutureAtMinus5;
var dataThree = $.getJSON("FutureAtMinus5.json", function(data){
    dataFutureAtMinus5 = dataThree.responseJSON;
});

var dataPast;
var dataFour = $.getJSON("pastData.json", function(data){
    dataPast = dataFour.responseJSON;
});
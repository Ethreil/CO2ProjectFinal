<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);


      
      
      
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Year', 'CO2'],
          ['2019',  <%= com.CarbonProject.Researcher.getCurrentCO2() %>],
          ['2023',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2023") %>],      
          ['2027',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2027") %>],      
          ['2031',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2031") %>],       
          ['2035',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2035") %>],        
          ['2039',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2039") %>],      
          ['2043',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2043") %>],      
          ['2047',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2047") %>],      
          ['2051',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2051") %>],           
          ['2054',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2054") %>],  
          ['2058',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2058") %>],         
          ['2062',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2062") %>],       
          ['2066',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2066") %>], 
          ['2070',  <%= com.CarbonProject.Researcher.getFutureCO2("2008","2018","2070") %>],  
        ]);

        var options = {
          title: 'Carbon Dioxide (ppm) vs Time (Years) At Rate Of Change over last decade',
          curveType: 'function',
          legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="curve_chart" style="width: 900px; height: 500px"></div>
  </body>
</html>
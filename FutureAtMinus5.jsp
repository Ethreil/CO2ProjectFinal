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
          ['2020',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2020") %>],      
          ['2021',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2021") %>],      
          ['2022',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2022") %>],       
          ['2023',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2023") %>],        
          ['2024',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2024") %>],      
          ['2025',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2025") %>],      
          ['2026',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2026") %>],      
          ['2027',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2027") %>],           
          ['2028',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2028") %>],  
          ['2029',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2029") %>],         
          ['2030',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2030") %>],       
          ['2031',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2031") %>], 
          ['2032',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2032") %>],  
          ['2033',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2033") %>],  
          ['2034',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2034") %>],  
          ['2035',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2035") %>],  
          ['2036',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2036") %>],  
          ['2037',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2037") %>],  
          ['2038',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2038") %>],  
          ['2039',  <%= com.CarbonProject.Researcher.getFutureCO2MinusFive("2017","2018","2039") %>],  
        ]);

        var options = {
          title: 'Carbon Dioxide (ppm) vs Time (Years) At Current Rate Of Change minus 5% per year',
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
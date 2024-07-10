const dollar_rate=83.49;
const pound_rate=106.95;
const yen_rate=0.52;

function convert(option1,option2,amount)
{

if(option1=="INR" && option2=="USD")
{
    var result=amount/dollar_rate;
    
    document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
}
if(option1=="USD" && option2=="INR")
    {
        var result=dollar_rate*amount;
        
        document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
    }
if(option1=="INR" && option2=="POUND")
        {
            var result=amount/pound_rate;
            
            document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
        }
if(option1=="USD" && option2=="POUND")
            {
                var result=amount/1.28;
                
                document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
            }
if(option1=="INR" && option2=="YEN")
                {
                    var result=amount/yen_rate;
                    
                    document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
                }
if(option1=="USD" && option2=="YEN")
                    {
                        var result=amount*161.49;
                        
                        document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
                    }
if(option1=="POUND" && option2=="INR")
                        {
                            var result=amount*pound_rate;
                            
                            document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
                        }
if(option1=="POUND" && option2=="YEN")
                            {
                                var result=amount*206.86;
                                
                                document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
                            }
if(option1=="POUND" && option2=="USD")
                                {
                                    var result=amount*1.28;
                                    
                                    document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
 
                                }

if(option1=="YEN" && option2=="INR")
                                    {
                                        var result=amount*yen_rate;
                                        
                                        document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
                                    }

if(option1=="YEN" && option2=="USD")
                                        {
                                            var result=amount/161.49;
                                            
                                            document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
                                        }
            if(option1=="YEN" && option2=="POUND")
                                            {
                                                var result=amount/206.86;
                                                
                                                document.getElementById("output3").innerHTML="The converted amount is : "+(result.toFixed(2));
                                            }
            }
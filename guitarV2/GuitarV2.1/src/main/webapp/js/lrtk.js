//star1
$(document).ready(function(){
    var stepW = 24;
    var description = new Array("1分","2分","3分","4分","5分");
    var stars = $("#star > li");
    var descriptionTemp;
    stars.each(function(i){
        $(stars[i]).click(function(e){
            var n = i+1;
            $("#showb").css({"width":stepW*n});
            descriptionTemp = description[i];
            $(this).find('a').blur();
            return stopDefault(e);
            return descriptionTemp;
        });
    });
    stars.each(function(i){
        $(stars[i]).click(function(e){
            var n = i+1;
            descriptionTemp = description[i];
            $(this).find('a').blur();
            return stopDefault(e);
            return descriptionTemp;
        });
    });
    stars.each(function(i){
        $(stars[i]).hover(
            function(){
                if(descriptionTemp != null)
                    $(".description").val(descriptionTemp);
                else 
                    $(".description").val(" ");
            }
        );
    });
});
function stopDefault(e){
    if(e && e.preventDefault)
           e.preventDefault();
    else
           window.event.returnValue = false;
    return false;
};
//star2
$(document).ready(function(){
    var stepW = 24;
    var description = new Array("1分","2分","3分","4分","5分");
    var stars = $("#star2 > li");
    var descriptionTemp;
    stars.each(function(i){
        $(stars[i]).click(function(e){
            var n = i+1;
            $("#showb2").css({"width":stepW*n});
            descriptionTemp = description[i];
            $(this).find('a').blur();
            return stopDefault(e);
            return descriptionTemp;
        });
    });
    stars.each(function(i){
        $(stars[i]).click(function(e){
            var n = i+1;
            descriptionTemp = description[i];
            $(this).find('a').blur();
            return stopDefault(e);
            return descriptionTemp;
        });
    });
    stars.each(function(i){
        $(stars[i]).hover(
            function(){
                if(descriptionTemp != null)
                    $(".description2").val(descriptionTemp);
                else 
                    $(".description2").val(" ");
            }
        );
    });
});
function stopDefault(e){
    if(e && e.preventDefault)
           e.preventDefault();
    else
           window.event.returnValue = false;
    return false;
};
//star3
$(document).ready(function(){
    var stepW = 24;
    var description = new Array("1分","2分","3分","4分","5分");
    var stars = $("#star3 > li");
    var descriptionTemp;
    stars.each(function(i){
        $(stars[i]).click(function(e){
            var n = i+1;
            $("#showb3").css({"width":stepW*n});
            descriptionTemp = description[i];
            $(this).find('a').blur();
            return stopDefault(e);
            return descriptionTemp;
        });
    });
    stars.each(function(i){
        $(stars[i]).click(function(e){
            var n = i+1;
            descriptionTemp = description[i];
            $(this).find('a').blur();
            return stopDefault(e);
            return descriptionTemp;
        });
    });
    stars.each(function(i){
        $(stars[i]).hover(
            function(){
                if(descriptionTemp != null)
                    $(".description3").val(descriptionTemp);
                else 
                    $(".description3").val("");
            }
        );
    });
});
function stopDefault(e){
    if(e && e.preventDefault)
           e.preventDefault();
    else
           window.event.returnValue = false;
    return false;
};
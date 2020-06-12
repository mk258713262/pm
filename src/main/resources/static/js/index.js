$("#numbers").bind("change", function () {
    var infoType = $("#numbers option:selected").val();
    $.ajax({
        url: CONTEXT_PATH+"/selector",
        type: "GET",
        data: {'infoType' : infoType},
        dataType: "json",
        success: function(data){
            $('#content').remove();
            // $('#container').load(url + ' #container').fadeIn('slow');
        },
        error:function(err){
            console.log(err.statusText);
            console.log('异常');
        }
    });
});
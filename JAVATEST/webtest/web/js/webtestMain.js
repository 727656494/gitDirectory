/**
 * Created by admin on 2015/1/17.
 */
window.onload=function(){
    alert('000');
    $.get('testaction',{},function(data){
        alert(data);
    },null);
};
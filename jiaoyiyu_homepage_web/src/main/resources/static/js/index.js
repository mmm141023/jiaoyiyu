function loginButtonClick() {
    window.location.href="http://localhost:8082/passport/index?returnUrl=http://localhost:8081/index";
}
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}

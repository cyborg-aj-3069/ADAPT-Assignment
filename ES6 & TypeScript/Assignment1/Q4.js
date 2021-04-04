var leng = function () {
    var args = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        args[_i] = arguments[_i];
    }
    var arr = [];
    for (var i = 0; i < args.length; i++) {
        arr.push(" Name : " + args[i]);
        arr.push(" Length : " + args[i].length);
    }
    return arr;
};
console.log(leng("Tom", "Ivan", "Jerry"));

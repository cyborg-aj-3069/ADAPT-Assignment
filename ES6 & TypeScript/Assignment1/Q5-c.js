function toCap() {
    var array = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        array[_i] = arguments[_i];
    }
    newArray = [5];
    array.map(function (name) {
        newName = name.toUpperCase();
        newArray.push(newName);
        console.log(newArray.join(','));
    });
}
toCap('sita', 'ram', 'laxman', 'jatayu', 'bali');

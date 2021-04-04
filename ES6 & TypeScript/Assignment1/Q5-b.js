var arrFrnd = ["Abhi", "Aj", "Golu"];
var UserFriends = function (a, b) {
    if (a === void 0) { a = "Aman"; }
    if (b === void 0) { b = arrFrnd; }
    console.log("User :" + a + " " + " Friends :" + b);
};
UserFriends();
UserFriends("Abhishek");
UserFriends("Abhishek", ["Mukesh", "Bala", "Vinnu"]);

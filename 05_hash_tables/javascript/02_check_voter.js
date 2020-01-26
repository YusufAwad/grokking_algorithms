var voted = new Map();
function check_voter(name){
    if(voted[name] == true){
        console.log("kick them out!");
    }
    else{
        voted[name] = true;
        console.log("let them vote!");
    }
}

check_voter("tom");
check_voter("mike");
check_voter("mike");

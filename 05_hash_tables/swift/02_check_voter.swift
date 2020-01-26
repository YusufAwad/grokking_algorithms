var voted = [String: Bool]()

func check_voter(name: String) {
    if let val = voted[name]{
        print("kick them out!")
    } else {
        voted[name] = true
        print("let them vote!")
    }
}

check_voter(name: "tom")
check_voter(name: "mike")
check_voter(name: "mike")
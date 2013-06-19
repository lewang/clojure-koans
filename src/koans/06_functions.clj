(defn multiply-by-ten [n]
  (* 10 n))

(defn square [n] (* n n))

(meditations
  "Calling a function is like giving it a hug with parentheses"
  (= 81 (square 9))
        ;;; ⇒ true

  "Functions are usually defined before they are used"
  (= 20 (multiply-by-ten 2))
        ;;; ⇒ true

  "But they can also be defined inline"
  (= 10 ((fn [n] (* 5 n)) 2))
        ;;; ⇒ true

  "Or using an even shorter syntax"
  (= 60 (#(* 15 %) 4))
        ;;; ⇒ true

  "Even anonymous functions may take multiple arguments"
  (= 15 (#(+ %1 %2 %3) 4 5 6))
        ;;; ⇒ true

  "One function can beget another"
  (= 9 (((fn [] #(+ % %2))) 4 5))
        ;;; ⇒ true

  "Functions can also take other functions as input"
  (= 20 ((fn [f] (f 4 5))
           *))
        ;;; ⇒ true

  "Higher-order functions take function arguments"
  (= 25 (#(% 5) (fn [n] (* n n))))
        ;;; ⇒ true

  "But they are often better written using the names of functions"
  (= 25 (#(% 5) square))
        ;;; ⇒ true

  )

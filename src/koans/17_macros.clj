(defmacro hello [x]
  (str "Hello, " x))
        ;;; ⇒ #'user/hello

(defmacro infix [form]
  (list (second form) (first form) (nth form 2)))
        ;;; ⇒ #'user/infix

(defmacro infix-better [form]
  `(~(second form) ; Note the syntax-quote (`) and unquote (~) characters!
    ~(first form)
    ~(nth form 2)))
        ;;; ⇒ #'user/infix-better

(defmacro r-infix [form]
  (cond (not (seq? form))
        form
        (= 1 (count form))
        `(r-infix ~(first form))
        :else
        (let [operator (second form)
              first-arg (first form)
              others (drop 2 form)]
          `(~operator
            (r-infix ~first-arg)
            (r-infix ~others)))))
        ;;; ⇒ #'user/r-infix

(meditations
  "Macros are like functions created at compile time"
  (= "Hello, Macros!" (hello "Macros!"))
        ;;; ⇒ true

  "I can haz infix?"
  (= 10 (infix (9 + 1)))
        ;;; ⇒ true

  "Remember, these are nothing but code transformations"
  (= '(+ 9 1) (macroexpand '(infix (9 + 1))))
        ;;; ⇒ true

  "You can do better than that - hand crafting FTW!"
  (= '(* 10 2) (macroexpand '(infix-better (10 * 2))))
        ;;; ⇒ true

  "Things don't always work as you would like them to... "
  (= '(+ 10 (2 * 3)) (macroexpand '(infix-better ( 10 + (2 * 3)))))
        ;;; ⇒ true

  "Really, you don't understand recursion until you understand recursion"
  (= 36 (r-infix (10 + (2 * 3) + (4 * 5))))
        ;;; ⇒ true

  )

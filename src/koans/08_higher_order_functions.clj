(meditations
  "The map function relates a sequence to another"
  (= [4 8 12] (map (fn [x] (* 4 x)) [1 2 3]))
        ;;; ⇒ true

  "You may create that mapping"
  (= [1 4 9 16 25] (map (fn [x] (* x x)) [1 2 3 4 5]))
        ;;; ⇒ true

  "Or use the names of existing functions"
  (= [false false true false false] (map nil? [:a :b nil :c :d]))
        ;;; ⇒ true

  "A filter can be strong"
  (= [] (filter (fn [x] false) '(:anything :goes :here)))
        ;;; ⇒ true

  "Or very weak"
  (= [:anything :goes :here] (filter (fn [x] true) '(:anything :goes :here)))
        ;;; ⇒ true

  "Or somewhere in between"
  (= [10 20 30] (filter (fn [x] (< x 31)) [10 20 30 40 50 60 70 80]))
        ;;; ⇒ true

  "Maps and filters may be combined"
  (= [10 20 30] (map (fn [x] (* x 10)) (filter (fn [x] (< x 4)) [1 2 3 4 5 6 7 8])))
        ;;; ⇒ true

  "Reducing can increase the result"
  (= 24 (reduce (fn [a b] (* a b)) [1 2 3 4]))
        ;;; ⇒ true

  "You can start somewhere else"
  (= 2400 (reduce (fn [a b] (* a b)) 100 [1 2 3 4]))
        ;;; ⇒ true

  "Numbers are not the only things one can reduce"
  (= "longest" (reduce (fn [a b]
                         (if (< (count a) (count b)) b a))
                       ["which" "word" "is" "longest"]))
        ;;; ⇒ true

  )

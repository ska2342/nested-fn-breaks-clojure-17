(ns nested-fn-breaks-clojure-17.core)

(defn this-function-breaks-with-clojure-1-7 [v]
  (let [my-anonymous-function
        (fn my-anonymous-function [s indent]
          (if (seq s)
            (for [is (my-anonymous-function s (str indent ">"))]
              (map str is))
            (str "#" s)))]
    (my-anonymous-function v)))

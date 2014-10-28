(defproject nested-fn-breaks-clojure-17 "0.1.0-SNAPSHOT"
  :description "Minimal example for a compilation problem with Clojure
  1.7.0-alpha3"
  :url "https://github.com/ska2342/nested-fn-breaks-clojure-17"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [;; ugly formatting for easier commenting
                 ;; this works:
                 [org.clojure/clojure "1.6.0"]
                 ;; this doesn't
                 ;;[org.clojure/clojure "1.7.0-alpha3"]
                 ]
    :profiles
    {:uberjar {:aot [nested-fn-breaks-clojure-17.core]
               :omit-source true}})

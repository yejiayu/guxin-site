(defproject guxin-site "0.1.0"
  :description "剑侠孤心"
  :url "http://jxgu.xin"
  :min-lein-version "2.0.0"

  :mirrors {"central" {:name "central"
                       :url "http://repo2.maven.org/maven2/"}}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [com.novemberain/monger "3.0.2"]]

  :plugins [[lein-ring "0.9.7"]]

  :ring {:handler guxin-site.handler/app}

  :profiles

  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})

(ns app.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [om-bootstrap.button :as b]
            [om-tools.dom :as d :include-macros true]))

(enable-console-print!)

(println "Edits to this text should show up in your developer console.")

;; define your app data so that it doesn't get over-written on reload

;; (defonce app-state (atom {:text "Hello Clojure!"}))

(defn Index [data onwer]
  (reify
    om/IRender
    (render [_]
      (d/div
        (b/button {:bs-style "primary"} "我是一个按钮")
        (dom/h1 nil (:text data))))))

(om/root
  Index
  {:text "Hello Clojure!"}
  {:target (. js/document (getElementById "app"))})


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)

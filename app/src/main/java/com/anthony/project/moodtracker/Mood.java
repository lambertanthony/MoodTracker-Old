package com.anthony.project.moodtracker;
 public class Mood {

      /**
         * Mood  en int
         * 0 = triste
         * 1 = déçu
         * 2 = normal
         * 3 = heureux
         * 4 = super heureux
         *
         */

        private  int moodState;
        private String comment;

     public Mood(int moodState, String comment) {
         this.moodState = moodState;
         this.comment = comment;
     }

     public int getMoodState() {
         return moodState;
     }

     public void setMoodState(int moodState) {
         this.moodState = moodState;
     }

     public String getComment() {
         return comment;
     }

     public void setComment(String comment) {
         this.comment = comment;
     }


     @Override
     public String toString() {
         return "Mood{" +
                 "moodState=" + moodState +
                 ", comment='" + comment + '\'' +
                 '}';
     }
 }














package com.ubt.myapplication.model;

import java.util.List;

/**
 * Created by chenqiang on 2019/8/21.
 */
public class AnnotationBean {


    private List<LabelAnnotationsBean> labelAnnotations;

    public List<LabelAnnotationsBean> getLabelAnnotations() {
        return labelAnnotations;
    }

    public void setLabelAnnotations(List<LabelAnnotationsBean> labelAnnotations) {
        this.labelAnnotations = labelAnnotations;
    }

    public static class LabelAnnotationsBean {
        /**
         * annotation : Unknown
         * similarity : 0.0
         */

        private String annotation;
        private double similarity;

        public String getAnnotation() {
            return annotation;
        }

        public void setAnnotation(String annotation) {
            this.annotation = annotation;
        }

        public double getSimilarity() {
            return similarity;
        }

        public void setSimilarity(double similarity) {
            this.similarity = similarity;
        }
    }
}

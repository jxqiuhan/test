package com.qiuhan;

import java.util.List;

public class AWSData {

    private List<ActionResponsesDTO> actionResponses;

    public List<ActionResponsesDTO> getActionResponses() {
        return actionResponses;
    }

    public void setActionResponses(List<ActionResponsesDTO> actionResponses) {
        this.actionResponses = actionResponses;
    }

    public static class ActionResponsesDTO {


        private String action;

        private List<DataDTO> data;


        public static class DataDTO {

            private String metricName;
            private List<DataPoint> datapoints;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public List<DataDTO> getData() {
            return data;
        }

        public void setData(List<DataDTO> data) {
            this.data = data;
        }
    }

    public static class DataPoint{
        private Long timestamp;
        private Integer sum;
        private String unit;

        public Long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
        }

        public Integer getSum() {
            return sum;
        }

        public void setSum(Integer sum) {
            this.sum = sum;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }


}



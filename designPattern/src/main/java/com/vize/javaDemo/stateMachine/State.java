package com.vize.javaDemo.stateMachine;

/**
 * Created by weizwang on 2015/12/25.
 */
public enum State {
    OFF {
        @Override
        void power(Aircon1 ac) {
            this.exit(ac);
            ac.state = FANONLY;
            ac.state.entry(ac);
        }

        @Override
        void cool(Aircon1 ac) {
            System.out.println("nothing");
        }
    },
    FANONLY {
        @Override
        void power(Aircon1 ac) {
            this.exit(ac);
            stopFan();
            ac.state = OFF;
            ac.state.entry(ac);
        }

        @Override
        void cool(Aircon1 ac) {
            this.exit(ac);
            ac.state = COOL;
            ac.state.entry(ac);
        }
    },
    COOL {
        void exit(Aircon1 ac) {
            super.entry(ac);
            stopCool();
        }

        void entry(Aircon1 ac) {
            stopCool();
            super.entry(ac);
        }

        @Override
        void power(Aircon1 ac) {
            this.exit(ac);
            stopFan();
            ac.state = OFF;
            ac.state.entry(ac);
        }

        @Override
        void cool(Aircon1 ac) {
            this.exit(ac);
            ac.state = FANONLY;
            ac.state.entry(ac);
        }
    };

    abstract void power(Aircon1 ac);

    abstract void cool(Aircon1 ac);

    void entry(Aircon1 ac) {
        System.out.println("->" + ac.state.name());
    }

    void exit(Aircon1 ac) {
        System.out.println(ac.state.name() + "->");
    }

    void startCool() {
        System.out.println("start cool");
    }

    void stopCool() {
        System.out.println("stop cool");
    }

    void startFan() {
        System.out.println("start fan");
    }

    void stopFan() {
        System.out.println("stop fan");
    }
    }

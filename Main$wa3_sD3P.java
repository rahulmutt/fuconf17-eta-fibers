    public static class $wa3_sD3P extends Function2 {
        public final Closure enter(StgContext paramStgContext)
        {
            Izh localIzh1;
            Closure localClosure5;
            for (int i = paramStgContext.I1;; i = ((Izh)localClosure5).x1) {
                Main.sat_sD40 localsat_sD40 = new Main.sat_sD40(this.x4, i);
                PrimOps.setCurrentC(paramStgContext, localsat_sD40);
                localIzh1 = new Izh(i);
                Main.a5_sD43 locala5_sD43 = new Main.a5_sD43(this.x1, this.x2, this.x3, this.x5, this, i, localIzh1);
                Main.sat_sD4R localsat_sD4R = new Main.sat_sD4R(locala5_sD43);
                PrimOps.pushNextC(paramStgContext, localsat_sD4R);
                int j = i - 1;
                Izh localIzh2 = new Izh(j);
                Closure localClosure1 = eta_fibers_dev.control.concurrent.fiber.MVar.$wa(paramStgContext, this.x4, localIzh2);
                Closure localClosure2 = PrimOps.popNextC(paramStgContext);
                PrimOps.setCurrentC(paramStgContext, locala5_sD43);
                if (i < 1) break;
                PrimOps.setCurrentC(paramStgContext, this.x3);
                PrimOps.pushNextC(paramStgContext, this.x5);
                localClosure3 = eta_fibers_dev.control.concurrent.fiber.MVar.$wa1(paramStgContext, this.x2);
                Closure localClosure4 = PrimOps.popNextC(paramStgContext);
                Ap2Upd localAp2Upd = new Ap2Upd(this.x5, localClosure3);
                PrimOps.setCurrentC(paramStgContext, localAp2Upd);
                localClosure5 = localClosure3.evaluate(paramStgContext);
            }
            Closure localClosure3 = this.x1.evaluate(paramStgContext);
            return eta_fibers_dev.control.concurrent.fiber.MVar.$wa(paramStgContext, ((base.ghc.mvar.datacons.MVar)localClosure3).x1, localIzh1);
        }
    }

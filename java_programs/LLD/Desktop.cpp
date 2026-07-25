
// Builder design pattern using c++ 
#include <iostream>

using namespace std;


class Desktop {

    public :
        string motherboard;
        string ram;
        string storage;
        string graphics;

        void display() {
            cout << "motherboard name " << motherboard;
            cout << "motherboard name " << ram;
            cout << "motherboard name " << storage;

        }

};

class DesktopBuilder {

    protected :
        Desktop desktop;

    public :
        virtual DesktopBuilder &buildMotherBOard() = 0;
        virtual DesktopBuilder &buildRam() = 0;
        virtual DesktopBuilder &buildStorage() = 0;
        virtual DesktopBuilder &buildGraphic() = 0;

    Desktop build() {
        return desktop;
    }



};


class DellDesktopBuilder : public DesktopBuilder {

    public :
    DesktopBuilder &buildMotherBOard() {
        desktop.motherboard = "Dell motherboard";
        return *this;
    }

    



};
import os

from library.app_00_intro import app
# from library.app_01_get import app
# from library.app_02_methods import app


if __name__ == '__main__':
    app.debug = True

    # If you have the debugger disabled or trust the users on your network,
    # you can make the server publicly available simply by adding host=0.0.0.0
    host = os.environ.get('IP', '0.0.0.0')
    
    # define your port. Default is 5000
    port = int(os.environ.get('PORT', 8080))

    # run(host=None, port=None, debug=None, load_dotenv=True, **options)
    # host – the hostname to listen on. Set this to '0.0.0.0' to have the server available externally as well.
    #        Defaults to '127.0.0.1' or the host in the SERVER_NAME config variable if present.
    # port – the port of the webserver. Defaults to 5000 or the port defined in the SERVER_NAME config variable if present.
    # debug – if given, enable or disable debug mode. See debug.
    # load_dotenv – Load the nearest .env and .flaskenv files to set environment variables. Will also change the working directory to the directory containing the first file found.
    # options – the options to be forwarded to the underlying Werkzeug server. See werkzeug.serving.run_simple() for more information.
    app.run(host=host, port=port, debug=True) 
  

    # Do not use run() in a production setting. It is not intended to meet security and performance requirements
    # for a production server. Instead, see Deployment Options for WSGI server recommendations.